package edu.java.file09;

/*
 * IO Stream: 바이트 스트림(byte stream). 읽기/쓰기의 기본 단위는 byte 단위.
 *   모든 파일 형식(txt, mp4, mp3, docx, pptx, ...)에서 사용 가능.
 * InputStream
 * |__ FileInputStream, BufferedInputStream, ObjectInputStream
 * OutputStream
 * |__ FileOutputStream, BufferedOutputStream, ObjectOutputStream
 * 
 * Reader/Writer: 문자 스트림(character stream). 읽기/쓰기의 기본 단위는 "문자(character)" 단위. 
 *   텍스트 파일 형식(txt, csv, dat, ...)에서 사용.
 * Reader
 * |__ InputStreamReader, BufferedReader
 *     |__ FileReader
 * Writer
 * |__ OutputStreamWriter, BufferedWriter
 *     |__ FileWriter
 *     
 * 운영 체제(OS: Operating System)의 기본 인코딩 방식
 *   - 한글 MS-Windows: EUC-KR(MS949, CP949), 영문 MS-Windows: CP1252
 *   - MacOS, Linux: UTF-8
 */

public class FileMain09 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
