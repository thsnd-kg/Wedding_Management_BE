package home.javaweb.bill.entity;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import home.javaweb.entity.FeastEntity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "bill")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "feast_id")
	private FeastEntity feast;
	
	@Column(name = "date_of_payment")
	private LocalDate dateOfPayment;
	
	@Column(name = "total_table_price")
	private Long totalTablePrice;
	
	@Column(name = "total_service_price")
	private Long totalServicePrice;
	
	@ManyToOne
	@JoinColumn(name =  "fine_id")
	private Fine fine;
	
	@Column(name = "total_fine")
	private Long totalFine;
	
	@Column(name = "total_bill")
	private Long totalBill;
	
	@Column(name = "unpaid_money")
	private Long unpaidMoney;
	
	@Column(name = "status")
	private int status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FeastEntity getFeast() {
		return feast;
	}

	public void setFeast(FeastEntity feast) {
		this.feast = feast;
	}

	public LocalDate getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(LocalDate dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Long getTotalTablePrice() {
		return totalTablePrice;
	}

	public void setTotalTablePrice(Long totalTablePrice) {
		this.totalTablePrice = totalTablePrice;
	}

	public Long getTotalServicePrice() {
		return totalServicePrice;
	}

	public void setTotalServicePrice(Long totalServicePrice) {
		this.totalServicePrice = totalServicePrice;
	}

	public Fine getFine() {
		return fine;
	}

	public void setFine(Fine fine) {
		this.fine = fine;
	}

	public Long getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(Long totalBill) {
		this.totalBill = totalBill;
	}

	public Long getUnpaidMoney() {
		return unpaidMoney;
	}

	public void setUnpaidMoney(Long unpaidMoney) {
		this.unpaidMoney = unpaidMoney;
	}


	public Long getTotalFine() {
		return totalFine;
	}

	public void setTotalFine(Long totalFine) {
		this.totalFine = totalFine;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
