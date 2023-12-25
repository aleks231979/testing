package homework5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
ContactRepositoy contacts;
ContactService contactService;
@BeforeEach
void init() {
    contacts = new ContactRepoInMemory();
    contactService = new ContactService(contacts);
}
// Проверка работы метода getContactByName на получение пользователя с использованием заглушки
    @Test
    void getContactByName() {
    String name = "Alex";
    Contact contact = contacts.getContactByName("Alex");
    assertNotNull(contact);
    // аналогично имени можно проверить фамилию через метод getSurname() и номер телефона getTel()
    assertEquals("Alex", contact.getName());
    }
// Проверяем получение всех записей
    @Test
    void getAllContact() {
    List<Contact> contactList = contacts.getAllContact();
    Contact contact = contactService.getContactByName("Tom");

    // Т.к вместо БД мы используем заглушку, то заведома известно кол-во записей в нашем хранилище
    assertEquals(3, contactList.size());
    // Аналогично можно проверить наличае и других пользователей. Правило эквивалентности прописано в классе
    // Contact с аннотацией @Override в методе equals
    assertTrue(contactList.contains(contact));
    }
    // Тест метода добавления контакта
    @Test
    void addContact() {
    Contact contact = new Contact("Alice", "Kupper", "87542368811");
    contacts.addContact(contact);
    // после добавления тестируем удлинение списка контактов на 1
    assertEquals(4, contacts.getAllContact().size());
    // Проверяем, что в списке действительно появилось новое значение
    assertTrue(contacts.getAllContact().contains(contact));
    // И что у этого нового значения правильно записан номер телефона
    assertTrue("87542368811".equals(contact.getTel()));
    }

    @Test
    void removeContact() {
        contacts.removeContact("Alice");
        assertEquals(3, contacts.getAllContact().size());
        // Проверяем, что в справочнике действительно нет контакта с именем Alice и номером телефона 87542368811
        Contact contact = new Contact("Alice", "Kupper", "87542368811");
        assertFalse(contacts.getAllContact().contains(contact));
    }

    @Test
    void updateContact() {
        Contact contact = contactService.getContactByName("Tom");
        contact.setTel("80001112233");
        assertTrue("80001112233".equals(contact.getTel()));
    }
}