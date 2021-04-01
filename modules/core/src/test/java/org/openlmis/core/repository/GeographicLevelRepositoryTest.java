/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2013 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org. 
 */

package org.openlmis.core.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.openlmis.core.domain.GeographicLevel;
import org.openlmis.core.repository.mapper.GeographicLevelMapper;
import org.openlmis.db.categories.UnitTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;

@Category(UnitTests.class)
@RunWith(MockitoJUnitRunner.class)
public class GeographicLevelRepositoryTest {

  @Mock
  private GeographicLevelMapper mapper;

  private GeographicLevelRepository repo;

  @Before
  public void setup() {
    repo = new GeographicLevelRepository(mapper);
  }

  @Test
  public void shouldUpdateOnSave() {
    GeographicLevel geoLevel = new GeographicLevel();
    geoLevel.setId(123L);

    repo.save(geoLevel);
    verify(mapper).update(geoLevel);
  }

  @Test
  public void shouldInsertOnSave() {
    GeographicLevel geoLevel = new GeographicLevel();
    geoLevel.setCode("abc");

    repo.save(geoLevel);
    verify(mapper).insert(geoLevel);
  }

  @Test
  public void shouldGetGeographicLevel() throws Exception {
    GeographicLevel expectedLevel = new GeographicLevel();
    expectedLevel.setCode("code");
    when(mapper.getGeographicLevelById(1)).thenReturn(expectedLevel);

    GeographicLevel actual = repo.getGeographicLevel(1);

    verify(mapper).getGeographicLevelById(1);
    assertEquals(actual.getCode(), "code");
  }
}
