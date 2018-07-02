/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq;


import de.vorb.npmstat.persistence.jooq.tables.DownloadCount;
import de.vorb.npmstat.persistence.jooq.tables.records.DownloadCountRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DownloadCountRecord> DOWNLOAD_COUNT_PKEY = UniqueKeys0.DOWNLOAD_COUNT_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<DownloadCountRecord> DOWNLOAD_COUNT_PKEY = Internal.createUniqueKey(DownloadCount.DOWNLOAD_COUNT, "download_count_pkey", DownloadCount.DOWNLOAD_COUNT.PACKAGE_NAME, DownloadCount.DOWNLOAD_COUNT.DATE);
    }
}