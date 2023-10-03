package tn.esprit.springprojectbi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id

    String  idReservation;
    Date anneeUniveritaire;
    boolean estVlide;
}
