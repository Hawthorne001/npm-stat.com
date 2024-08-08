/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq.tables;


import de.vorb.npmstat.persistence.converters.LocalDateConverter;
import de.vorb.npmstat.persistence.jooq.Indexes;
import de.vorb.npmstat.persistence.jooq.Keys;
import de.vorb.npmstat.persistence.jooq.Public;
import de.vorb.npmstat.persistence.jooq.tables.records.DownloadCountRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DownloadCount extends TableImpl<DownloadCountRecord> {

    private static final long serialVersionUID = -926740527;

    /**
     * The reference instance of <code>public.download_count</code>
     */
    public static final DownloadCount DOWNLOAD_COUNT = new DownloadCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DownloadCountRecord> getRecordType() {
        return DownloadCountRecord.class;
    }

    /**
     * The column <code>public.download_count.package_name</code>.
     */
    public final TableField<DownloadCountRecord, String> PACKAGE_NAME = createField("package_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.download_count.date</code>.
     */
    public final TableField<DownloadCountRecord, LocalDate> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "", new LocalDateConverter());

    /**
     * The column <code>public.download_count.count</code>.
     */
    public final TableField<DownloadCountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.download_count</code> table reference
     */
    public DownloadCount() {
        this(DSL.name("download_count"), null);
    }

    /**
     * Create an aliased <code>public.download_count</code> table reference
     */
    public DownloadCount(String alias) {
        this(DSL.name(alias), DOWNLOAD_COUNT);
    }

    /**
     * Create an aliased <code>public.download_count</code> table reference
     */
    public DownloadCount(Name alias) {
        this(alias, DOWNLOAD_COUNT);
    }

    private DownloadCount(Name alias, Table<DownloadCountRecord> aliased) {
        this(alias, aliased, null);
    }

    private DownloadCount(Name alias, Table<DownloadCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DOWNLOAD_COUNT_DATE_IDX, Indexes.DOWNLOAD_COUNT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DownloadCountRecord> getPrimaryKey() {
        return Keys.DOWNLOAD_COUNT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DownloadCountRecord>> getKeys() {
        return Arrays.<UniqueKey<DownloadCountRecord>>asList(Keys.DOWNLOAD_COUNT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DownloadCount as(String alias) {
        return new DownloadCount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DownloadCount as(Name alias) {
        return new DownloadCount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DownloadCount rename(String name) {
        return new DownloadCount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DownloadCount rename(Name name) {
        return new DownloadCount(name, null);
    }
}
