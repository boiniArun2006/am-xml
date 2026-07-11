package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new j();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        /* synthetic */ ComponentSplice(int i2, long j2, long j3, j jVar) {
            this(i2, j2, j3);
        }

        private ComponentSplice(int i2, long j2, long j3) {
            this.componentTag = i2;
            this.componentSplicePts = j2;
            this.componentSplicePlaybackPositionUs = j3;
        }

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }
    }

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }

        j() {
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, j jVar) {
        this(parcel);
    }

    private SpliceInsertCommand(long j2, boolean z2, boolean z3, boolean z4, boolean z5, long j3, long j4, List<ComponentSplice> list, boolean z6, long j5, int i2, int i3, int i5) {
        this.spliceEventId = j2;
        this.spliceEventCancelIndicator = z2;
        this.outOfNetworkIndicator = z3;
        this.programSpliceFlag = z4;
        this.spliceImmediateFlag = z5;
        this.programSplicePts = j3;
        this.programSplicePlaybackPositionUs = j4;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z6;
        this.breakDurationUs = j5;
        this.uniqueProgramId = i2;
        this.availNum = i3;
        this.availsExpected = i5;
    }

    static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j2, TimestampAdjuster timestampAdjuster) {
        List list;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int unsignedByte;
        int unsignedByte2;
        boolean z6;
        int i3;
        long spliceTime;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z7 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = -9223372036854775807L;
        if (z7) {
            list = list2;
            j3 = -9223372036854775807L;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i2 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z9 = (unsignedByte3 & 128) != 0;
            boolean z10 = (unsignedByte3 & 64) != 0;
            boolean z11 = (unsignedByte3 & 32) != 0;
            boolean z12 = (unsignedByte3 & 16) != 0;
            long spliceTime2 = (!z10 || z12) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j2);
            if (!z10) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i5 = 0;
                while (i5 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    if (z12) {
                        i3 = unsignedByte4;
                        spliceTime = -9223372036854775807L;
                    } else {
                        i3 = unsignedByte4;
                        spliceTime = TimeSignalCommand.parseSpliceTime(parsableByteArray, j2);
                    }
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime), null));
                    i5++;
                    unsignedByte4 = i3;
                }
                list2 = arrayList;
            }
            if (z11) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z13 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z6 = z13;
            } else {
                z6 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j4 = spliceTime2;
            j3 = unsignedInt2;
            unsignedInt2 = j4;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i2 = unsignedShort;
            z5 = z6;
            z2 = z9;
            z3 = z10;
            list = list2;
            z4 = z12;
        }
        return new SpliceInsertCommand(unsignedInt, z7, z2, z3, z4, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z5, j3, i2, unsignedByte, unsignedByte2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.componentSpliceList.get(i3).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
