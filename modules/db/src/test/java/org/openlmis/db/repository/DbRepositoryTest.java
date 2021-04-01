/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2013 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org. 
 */

package org.openlmis.db.repository;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openlmis.db.categories.UnitTests;
import org.openlmis.db.repository.mapper.DbMapper;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@Category(UnitTests.class)
@RunWith(MockitoJUnitRunner.class)
public class DbRepositoryTest {

  @Mock
  DbMapper dbMapper;

  @InjectMocks
  DbRepository dbRepository;

  @Test
  public void shouldGetCurrentDbTimeStamp() throws Exception {
    Date expectedTimeStamp = new Date();
    when(dbMapper.getCurrentTimeStamp()).thenReturn(expectedTimeStamp);

    Date currentTimeStamp = dbRepository.getCurrentTimeStamp();

    assertThat(currentTimeStamp, is(expectedTimeStamp));
    verify(dbMapper).getCurrentTimeStamp();
  }

  @Test
  public void shouldGetCountByTableName() throws Exception {
    String table = "facilities";
    when(dbMapper.getCount(table)).thenReturn(15);

    int facilityCount = dbRepository.getCount(table);

    assertThat(facilityCount, is(15));
    verify(dbMapper).getCount(table);
  }
}
