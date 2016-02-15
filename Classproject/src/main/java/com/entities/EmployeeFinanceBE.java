/**
 * 
 */
package com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_EMPLOYEEFINANCE")
public class EmployeeFinanceBE {

	private long id;

	private long amountPaid;

	private Date receivedDate;

	private EmployeeBE employee;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "EFTBSEQ", sequenceName = "CCSD_EMPLOYEEFINANCE_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EFTBSEQ")
	@Column(name = "EFTB_ID", unique = true, nullable = false)
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the amountPaid
	 */
	@Column(name = "EFTB_AMOUNTPAID")
	public long getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid
	 *            the amountPaid to set
	 */
	public void setAmountPaid(long amountPaid) {
		this.amountPaid = amountPaid;
	}

	/**
	 * @return the receivedDate
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "EFTB_RECEIVEDDATE")
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate
	 *            the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @return the employee
	 */
	@ManyToOne
	@JoinColumn(name = "EFTB_EMPLOYEEID_FK")
	public EmployeeBE getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(EmployeeBE employee) {
		this.employee = employee;
	}

}
