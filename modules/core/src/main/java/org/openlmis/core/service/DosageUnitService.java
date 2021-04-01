/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2013 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org. 
 */

package org.openlmis.core.service;

import lombok.NoArgsConstructor;
import org.openlmis.core.domain.DosageUnit;
import org.openlmis.core.repository.DosageUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@NoArgsConstructor
public class DosageUnitService {

  private DosageUnitRepository duRep;

  @Autowired
  public DosageUnitService(DosageUnitRepository dosageUnitRepository) {
    this.duRep = dosageUnitRepository;
  }

  public DosageUnit getExisting(DosageUnit du) {
    return duRep.getExisting(du);
  }

  public void save(DosageUnit du) {
    if( du.hasId() ) duRep.update(du);
    else duRep.insert(du);
  }
}
