package se.taekwondointernship.data.models.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String parentName;

    private String parentNumber;

    private String email;

    private String socialSecurityNumber;

    private String age;

    private boolean permissionPhoto = false;

    public Person(Integer personId, String firstName, String lastName, String phoneNumber, String parentName,
                  String parentNumber, String email, String socialSecurityNumber, boolean permissionPhoto){
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.parentName = parentName;
        this.parentNumber = parentNumber;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
        this.permissionPhoto = permissionPhoto;
    }

    private String jaOrNej(boolean permissionPhoto){
        if (permissionPhoto){
            return "Ja";
        } else {
            return "Nej";
        }
    }
    public String toStringSmall(){
        return "[Namn: " + firstName + " " + lastName +
                ", Telefonnumner: " + phoneNumber +
                '\'' + ", Kontaktpersons namn: " + parentName +
                ", Kontaktpersons telefonnummer: " + parentNumber + "]";
    }
    @Override
    public String toString(){
        return "[Namn: " + firstName + " " + lastName + '\'' +
                ", Telefonnummer: " + phoneNumber + '\'' +
                ", Ålder: " + age + '\'' +
                ", Email: " + email + '\'' +
                ", Kontaktpersons namn: " + parentName + '\'' +
                ", Kontaktpersons telefonnummer: " + parentNumber + '\'' +
                ", Tillåtelse att fotograferas och synas på sociala medier: " + jaOrNej(permissionPhoto) +
                "]";
    }
}
