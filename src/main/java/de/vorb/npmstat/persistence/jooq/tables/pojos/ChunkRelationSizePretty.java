/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

import jakarta.annotation.Generated;


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
public class ChunkRelationSizePretty implements Serializable {

    private static final long serialVersionUID = 1071010606;

    private Integer  chunkId;
    private String   chunkTable;
    private String[] partitioningColumns;
    private Object[] partitioningColumnTypes;
    private String[] partitioningHashFunctions;
    private String[] ranges;
    private String   tableSize;
    private String   indexSize;
    private String   toastSize;
    private String   totalSize;

    public ChunkRelationSizePretty() {}

    public ChunkRelationSizePretty(ChunkRelationSizePretty value) {
        this.chunkId = value.chunkId;
        this.chunkTable = value.chunkTable;
        this.partitioningColumns = value.partitioningColumns;
        this.partitioningColumnTypes = value.partitioningColumnTypes;
        this.partitioningHashFunctions = value.partitioningHashFunctions;
        this.ranges = value.ranges;
        this.tableSize = value.tableSize;
        this.indexSize = value.indexSize;
        this.toastSize = value.toastSize;
        this.totalSize = value.totalSize;
    }

    public ChunkRelationSizePretty(
        Integer  chunkId,
        String   chunkTable,
        String[] partitioningColumns,
        Object[] partitioningColumnTypes,
        String[] partitioningHashFunctions,
        String[] ranges,
        String   tableSize,
        String   indexSize,
        String   toastSize,
        String   totalSize
    ) {
        this.chunkId = chunkId;
        this.chunkTable = chunkTable;
        this.partitioningColumns = partitioningColumns;
        this.partitioningColumnTypes = partitioningColumnTypes;
        this.partitioningHashFunctions = partitioningHashFunctions;
        this.ranges = ranges;
        this.tableSize = tableSize;
        this.indexSize = indexSize;
        this.toastSize = toastSize;
        this.totalSize = totalSize;
    }

    public Integer getChunkId() {
        return this.chunkId;
    }

    public ChunkRelationSizePretty setChunkId(Integer chunkId) {
        this.chunkId = chunkId;
        return this;
    }

    public String getChunkTable() {
        return this.chunkTable;
    }

    public ChunkRelationSizePretty setChunkTable(String chunkTable) {
        this.chunkTable = chunkTable;
        return this;
    }

    public String[] getPartitioningColumns() {
        return this.partitioningColumns;
    }

    public ChunkRelationSizePretty setPartitioningColumns(String... partitioningColumns) {
        this.partitioningColumns = partitioningColumns;
        return this;
    }

    public Object[] getPartitioningColumnTypes() {
        return this.partitioningColumnTypes;
    }

    public ChunkRelationSizePretty setPartitioningColumnTypes(Object... partitioningColumnTypes) {
        this.partitioningColumnTypes = partitioningColumnTypes;
        return this;
    }

    public String[] getPartitioningHashFunctions() {
        return this.partitioningHashFunctions;
    }

    public ChunkRelationSizePretty setPartitioningHashFunctions(String... partitioningHashFunctions) {
        this.partitioningHashFunctions = partitioningHashFunctions;
        return this;
    }

    public String[] getRanges() {
        return this.ranges;
    }

    public ChunkRelationSizePretty setRanges(String... ranges) {
        this.ranges = ranges;
        return this;
    }

    public String getTableSize() {
        return this.tableSize;
    }

    public ChunkRelationSizePretty setTableSize(String tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    public String getIndexSize() {
        return this.indexSize;
    }

    public ChunkRelationSizePretty setIndexSize(String indexSize) {
        this.indexSize = indexSize;
        return this;
    }

    public String getToastSize() {
        return this.toastSize;
    }

    public ChunkRelationSizePretty setToastSize(String toastSize) {
        this.toastSize = toastSize;
        return this;
    }

    public String getTotalSize() {
        return this.totalSize;
    }

    public ChunkRelationSizePretty setTotalSize(String totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ChunkRelationSizePretty other = (ChunkRelationSizePretty) obj;
        if (chunkId == null) {
            if (other.chunkId != null)
                return false;
        }
        else if (!chunkId.equals(other.chunkId))
            return false;
        if (chunkTable == null) {
            if (other.chunkTable != null)
                return false;
        }
        else if (!chunkTable.equals(other.chunkTable))
            return false;
        if (partitioningColumns == null) {
            if (other.partitioningColumns != null)
                return false;
        }
        else if (!Arrays.equals(partitioningColumns, other.partitioningColumns))
            return false;
        if (partitioningColumnTypes == null) {
            if (other.partitioningColumnTypes != null)
                return false;
        }
        else if (!Arrays.equals(partitioningColumnTypes, other.partitioningColumnTypes))
            return false;
        if (partitioningHashFunctions == null) {
            if (other.partitioningHashFunctions != null)
                return false;
        }
        else if (!Arrays.equals(partitioningHashFunctions, other.partitioningHashFunctions))
            return false;
        if (ranges == null) {
            if (other.ranges != null)
                return false;
        }
        else if (!Arrays.equals(ranges, other.ranges))
            return false;
        if (tableSize == null) {
            if (other.tableSize != null)
                return false;
        }
        else if (!tableSize.equals(other.tableSize))
            return false;
        if (indexSize == null) {
            if (other.indexSize != null)
                return false;
        }
        else if (!indexSize.equals(other.indexSize))
            return false;
        if (toastSize == null) {
            if (other.toastSize != null)
                return false;
        }
        else if (!toastSize.equals(other.toastSize))
            return false;
        if (totalSize == null) {
            if (other.totalSize != null)
                return false;
        }
        else if (!totalSize.equals(other.totalSize))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.chunkId == null) ? 0 : this.chunkId.hashCode());
        result = prime * result + ((this.chunkTable == null) ? 0 : this.chunkTable.hashCode());
        result = prime * result + ((this.partitioningColumns == null) ? 0 : Arrays.hashCode(this.partitioningColumns));
        result = prime * result + ((this.partitioningColumnTypes == null) ? 0 : Arrays.hashCode(this.partitioningColumnTypes));
        result = prime * result + ((this.partitioningHashFunctions == null) ? 0 : Arrays.hashCode(this.partitioningHashFunctions));
        result = prime * result + ((this.ranges == null) ? 0 : Arrays.hashCode(this.ranges));
        result = prime * result + ((this.tableSize == null) ? 0 : this.tableSize.hashCode());
        result = prime * result + ((this.indexSize == null) ? 0 : this.indexSize.hashCode());
        result = prime * result + ((this.toastSize == null) ? 0 : this.toastSize.hashCode());
        result = prime * result + ((this.totalSize == null) ? 0 : this.totalSize.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ChunkRelationSizePretty (");

        sb.append(chunkId);
        sb.append(", ").append(chunkTable);
        sb.append(", ").append(Arrays.toString(partitioningColumns));
        sb.append(", ").append(Arrays.toString(partitioningColumnTypes));
        sb.append(", ").append(Arrays.toString(partitioningHashFunctions));
        sb.append(", ").append(Arrays.toString(ranges));
        sb.append(", ").append(tableSize);
        sb.append(", ").append(indexSize);
        sb.append(", ").append(toastSize);
        sb.append(", ").append(totalSize);

        sb.append(")");
        return sb.toString();
    }
}
