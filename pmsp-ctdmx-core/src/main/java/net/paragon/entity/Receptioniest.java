package net.paragon.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ctmx_Employee")
@DiscriminatorValue("Receptionist")
public class Receptioniest extends Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -32398777822919849L;

	public Receptioniest() {
	}

}
