/*
 * Copyright 2015, 2016 Ether.Camp Inc. (US)
 * This file is part of Ethereum Harmony.
 *
 * Ethereum Harmony is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ethereum Harmony is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ethereum Harmony.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ethercamp.harmony.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigInteger;

/**
 * Created by Stan Reshetnyk on 24.08.16.
 */
@Value
@AllArgsConstructor
public class WalletAddressDTO {

    private final String name;

    private final String publicAddress;

    private final BigInteger amount;

    private final BigInteger pendingAmount;

    private final boolean hasKeystoreKey;
}
