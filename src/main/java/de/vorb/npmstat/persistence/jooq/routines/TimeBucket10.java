/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq.routines;


import de.vorb.npmstat.persistence.jooq.Public;

import jakarta.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class TimeBucket10 extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -496933367;

    /**
     * The parameter <code>public.time_bucket.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.time_bucket.bucket_width</code>.
     */
    public static final Parameter<Long> BUCKET_WIDTH = createParameter("bucket_width", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.time_bucket.ts</code>.
     */
    public static final Parameter<Long> TS = createParameter("ts", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.time_bucket.offset</code>.
     */
    public static final Parameter<Long> OFFSET = createParameter("offset", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public TimeBucket10() {
        super("time_bucket", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(BUCKET_WIDTH);
        addInParameter(TS);
        addInParameter(OFFSET);
        setOverloaded(true);
    }

    /**
     * Set the <code>bucket_width</code> parameter IN value to the routine
     */
    public void setBucketWidth(Long value) {
        setValue(BUCKET_WIDTH, value);
    }

    /**
     * Set the <code>bucket_width</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public TimeBucket10 setBucketWidth(Field<Long> field) {
        setField(BUCKET_WIDTH, field);
        return this;
    }

    /**
     * Set the <code>ts</code> parameter IN value to the routine
     */
    public void setTs(Long value) {
        setValue(TS, value);
    }

    /**
     * Set the <code>ts</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public TimeBucket10 setTs(Field<Long> field) {
        setField(TS, field);
        return this;
    }

    /**
     * Set the <code>offset</code> parameter IN value to the routine
     */
    public void setOffset(Long value) {
        setValue(OFFSET, value);
    }

    /**
     * Set the <code>offset</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public TimeBucket10 setOffset(Field<Long> field) {
        setField(OFFSET, field);
        return this;
    }
}
