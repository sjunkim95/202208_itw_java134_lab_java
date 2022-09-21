package edu.java.contact.ver04;

import java.io.File;
import java.util.List;

// 패키지의 클래스가 가지고 있는 static으로 선언된 모든 멤버(필드, 메서드) 이름을 import
import static edu.java.contact.fileutil.FileUtil.*;

// MVC 아키텍쳐에서 Controller를 구현하는 클래스.
public class ContactDaoImpl implements ContactDao {
    private List<Contact> contacts; // 연락처 데이터
    private File dataDir; // 연락처 데이터 파일이 저장된 폴더
    private File dataFile; // 연락 데이터 파일

    // singleton
    private static ContactDaoImpl instance = null;
    
    private ContactDaoImpl() {
        dataDir = initDataDir();
        dataFile = new File(DATA_DIR, DATA_FILE);
        contacts = initData();
    }
    
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        
        return instance;
    }
    
    @Override
    public List<Contact> read() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Contact read(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int create(Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(int index, Contact contact) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

}
