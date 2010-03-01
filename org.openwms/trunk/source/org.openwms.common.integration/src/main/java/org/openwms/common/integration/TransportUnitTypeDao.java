/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.common.integration;

import org.openwms.common.domain.TransportUnitType;

/**
 * A TransportUnitTypeDao.
 * <p>
 * Adds additional behavior to the {@link GenericDao} to operate on
 * {@link TransportUnitType} Entity classes.
 * </p>
 * 
 * @author <a href="mailto:openwms@googlemail.com">Heiko Scherrer</a>
 * @version $Revision$
 * @since 0.1
 * @see {@link org.openwms.common.integration.GenericDao}
 * @see {@link org.openwms.common.domain.TransportUnitType}
 */
public interface TransportUnitTypeDao extends GenericDao<TransportUnitType, String> {

    /**
     * Name of the <code>NamedQuery</code> to find all {@link TransportUnitType}
     * Entities.
     */
    final String NQ_FIND_ALL = "TransportUnitType.findAll";

    /**
     * Name of the <code>NamedQuery</code> to find a {@link TransportUnitType}
     * by {@link TransportUnitType#getName()}.
     */
    final String NQ_FIND_BY_NAME = "TransportUnitType.findByName";
}