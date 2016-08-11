/**
 * licecse.. etc
 */
package kr.co.kosta.contact.service;

import java.util.List;

import kr.co.kosta.contact.model.Contact;

/**
 * 클래스 설명
 * @author kim
 * @version
 *
 */
public interface ContactService {

	/**
	 * 메소드 설명
	 * @param contact
	 */
	void registContact(Contact contact);
	
	/**
	 * 
	 * @return
	 */
	List<Contact> listContact();
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	Contact detailContact(String name);
	
	/**
	 * 
	 * @param name
	 */
	void removeContact(String name);
}
