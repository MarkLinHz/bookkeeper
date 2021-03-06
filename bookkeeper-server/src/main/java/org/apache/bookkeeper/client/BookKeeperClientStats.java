/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.bookkeeper.client;

/**
 * List of constants for defining client stats names.
 */
public interface BookKeeperClientStats {
    String CLIENT_SCOPE = "bookkeeper_client";

    // Metadata Operations

    String CREATE_OP = "LEDGER_CREATE";
    String DELETE_OP = "LEDGER_DELETE";
    String OPEN_OP = "LEDGER_OPEN";
    String RECOVER_OP = "LEDGER_RECOVER";
    String LEDGER_RECOVER_READ_ENTRIES = "LEDGER_RECOVER_READ_ENTRIES";
    String LEDGER_RECOVER_ADD_ENTRIES = "LEDGER_RECOVER_ADD_ENTRIES";
    String LEDGER_ENSEMBLE_BOOKIE_DISTRIBUTION = "LEDGER_ENSEMBLE_BOOKIE_DISTRIBUTION";

    // Data Operations

    String ADD_OP = "ADD_ENTRY";
    String READ_OP = "READ_ENTRY";
    String WRITE_LAC_OP = "WRITE_LAC";
    String READ_LAC_OP = "READ_LAC";
    String READ_LAST_CONFIRMED_AND_ENTRY = "READ_LAST_CONFIRMED_AND_ENTRY";
    String READ_LAST_CONFIRMED_AND_ENTRY_RESPONSE = "READ_LAST_CONFIRMED_AND_ENTRY_RESPONSE";
    String PENDING_ADDS = "NUM_PENDING_ADD";
    String ENSEMBLE_CHANGES = "NUM_ENSEMBLE_CHANGE";
    String LAC_UPDATE_HITS = "LAC_UPDATE_HITS";
    String LAC_UPDATE_MISSES = "LAC_UPDATE_MISSES";
    String GET_BOOKIE_INFO_OP = "GET_BOOKIE_INFO";
    String SPECULATIVE_READ_COUNT = "SPECULATIVE_READ_COUNT";

    // per channel stats
    String CHANNEL_SCOPE = "per_channel_bookie_client";

    String CHANNEL_READ_OP = "READ_ENTRY";
    String CHANNEL_TIMEOUT_READ = "TIMEOUT_READ_ENTRY";
    String CHANNEL_ADD_OP = "ADD_ENTRY";
    String CHANNEL_TIMEOUT_ADD = "TIMEOUT_ADD_ENTRY";
    String CHANNEL_WRITE_LAC_OP = "WRITE_LAC";
    String CHANNEL_TIMEOUT_WRITE_LAC = "TIMEOUT_WRITE_LAC";
    String CHANNEL_READ_LAC_OP = "READ_LAC";
    String CHANNEL_TIMEOUT_READ_LAC = "TIMEOUT_READ_LAC";
    String TIMEOUT_GET_BOOKIE_INFO = "TIMEOUT_GET_BOOKIE_INFO";
    String CHANNEL_START_TLS_OP = "START_TLS";
    String CHANNEL_TIMEOUT_START_TLS_OP = "TIMEOUT_START_TLS";
    String NETTY_EXCEPTION_CNT = "NETTY_EXCEPTION_CNT";
    String CLIENT_CONNECT_TIMER = "CLIENT_CONNECT_TIMER";
    String ADD_OP_OUTSTANDING = "ADD_OP_OUTSTANDING";
    String READ_OP_OUTSTANDING = "READ_OP_OUTSTANDING";
    String NETTY_OPS = "NETTY_OPS";
}
