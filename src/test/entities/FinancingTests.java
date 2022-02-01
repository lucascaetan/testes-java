package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreatedObjectWhenValidData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenDataIsValid() {
		
		//Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//Act
		f.setTotalAmount(90000.0);
		
		//Assert
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenDataIsValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenDataIsValid() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setIncome(3000.0);
		
		Assertions.assertEquals(3000.0, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenDataIsValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing f = new Financing(100000.0, 2000.0, 20);
			
			f.setIncome(1500.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenDataIsValid() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(90);
		
		Assertions.assertEquals(90, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenDataIsValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
		Financing f = new Financing(100000.0, 2000.0, 80);
			
		f.setMonths(70);
		});
	}
	
	@Test
	public void entryShouldCorrectlyCalculateTheInputValue() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void  quotaShouldCorrectlyCalculateTheInputValue() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}
}
