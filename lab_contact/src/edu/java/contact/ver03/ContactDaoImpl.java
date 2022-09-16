package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.ver02.Contact;

public class ContactDaoImpl implements ContactDao {
    
    private List<Contact> contacts = new ArrayList<>();
    
    private static ContactDaoImpl instance = null;
    
    private ContactDaoImpl() {}
    
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        
        return instance;
    }

    @Override
    public List<Contact> read() {
        return contacts;
    }

    @Override
    public Contact read(int index) {
        if (!isValidIndex(index)) {
            return null;
        }
        
        return contacts.get(index);
    }

    @Override
    public int create(Contact contact) {
        contacts.add(contact);
        return 1;
    }

    @Override
    public int update(int index, Contact contact) {
        if (!isValidIndex(index)) {
            return 0;
        }
        
        Contact c = contacts.get(index);
        c.setName(contact.getName());
        c.setPhone(contact.getPhone());
        c.setEmail(contact.getEmail());
        
        return 1;
    }

    @Override
    public int delete(int index) {
        if (!isValidIndex(index)) {
            return 0;
        }
        
        contacts.remove(index);
        
        return 1;
    }

    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < contacts.size());
    }
    
}
