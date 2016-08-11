/**
 * licecse.. etc
 */
package kr.co.kosta.contact.service;

import java.util.List;

import kr.co.kosta.contact.model.Contact;

/**
 * Å¬·¡½º ¼³¸í
 * @author kim
 * @version
 *
 */
public interface ContactService {

	/**
	 * ¸Þ¼Òµå ¼³¸í
	 * @param contact 서버에서 수정했어요
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
