/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq.tables.records;


import de.vorb.npmstat.persistence.jooq.tables.HypertableRelationSize;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class HypertableRelationSizeRecord extends TableRecordImpl<HypertableRelationSizeRecord> implements Record4<Long, Long, Long, Long> {

    private static final long serialVersionUID = 1547856921;

    /**
     * Setter for <code>public.hypertable_relation_size.table_bytes</code>.
     */
    public HypertableRelationSizeRecord setTableBytes(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_relation_size.table_bytes</code>.
     */
    public Long getTableBytes() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.hypertable_relation_size.index_bytes</code>.
     */
    public HypertableRelationSizeRecord setIndexBytes(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_relation_size.index_bytes</code>.
     */
    public Long getIndexBytes() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.hypertable_relation_size.toast_bytes</code>.
     */
    public HypertableRelationSizeRecord setToastBytes(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_relation_size.toast_bytes</code>.
     */
    public Long getToastBytes() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.hypertable_relation_size.total_bytes</code>.
     */
    public HypertableRelationSizeRecord setTotalBytes(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.hypertable_relation_size.total_bytes</code>.
     */
    public Long getTotalBytes() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HypertableRelationSize.HYPERTABLE_RELATION_SIZE.TABLE_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return HypertableRelationSize.HYPERTABLE_RELATION_SIZE.INDEX_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return HypertableRelationSize.HYPERTABLE_RELATION_SIZE.TOAST_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return HypertableRelationSize.HYPERTABLE_RELATION_SIZE.TOTAL_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTableBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIndexBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getToastBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getTotalBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTableBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIndexBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getToastBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getTotalBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableRelationSizeRecord value1(Long value) {
        setTableBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableRelationSizeRecord value2(Long value) {
        setIndexBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableRelationSizeRecord value3(Long value) {
        setToastBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableRelationSizeRecord value4(Long value) {
        setTotalBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HypertableRelationSizeRecord values(Long value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HypertableRelationSizeRecord
     */
    public HypertableRelationSizeRecord() {
        super(HypertableRelationSize.HYPERTABLE_RELATION_SIZE);
    }

    /**
     * Create a detached, initialised HypertableRelationSizeRecord
     */
    public HypertableRelationSizeRecord(Long tableBytes, Long indexBytes, Long toastBytes, Long totalBytes) {
        super(HypertableRelationSize.HYPERTABLE_RELATION_SIZE);

        set(0, tableBytes);
        set(1, indexBytes);
        set(2, toastBytes);
        set(3, totalBytes);
    }
}
