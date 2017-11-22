package com.powermock.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;

import com.powermock.dao.util.IDGenerator;
import com.powermock.dto.User;

import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

		@Test
		public void createShouldReturnAUserId() {

			UserDAO dao = new UserDAO();

			mockStatic(IDGenerator.class);
			when(IDGenerator.generateID()).thenReturn(1);
			int result = dao.create(new User());
			assertEquals(1, result);
			verifyStatic();
		}
}
