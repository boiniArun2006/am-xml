package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new j();
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* synthetic */ ComponentSplice(int i2, long j2, j jVar) {
            this(i2, j2);
        }

        private ComponentSplice(int i2, long j2) {
            this.componentTag = i2;
            this.utcSpliceTime = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j2, boolean z2, boolean z3, boolean z4, List<ComponentSplice> list, long j3, boolean z5, long j4, int i2, int i3, int i5) {
            this.spliceEventId = j2;
            this.spliceEventCancelIndicator = z2;
            this.outOfNetworkIndicator = z3;
            this.programSpliceFlag = z4;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j3;
            this.autoReturn = z5;
            this.breakDurationUs = j4;
            this.uniqueProgramId = i2;
            this.availNum = i3;
            this.availsExpected = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.componentSpliceList.get(i2).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z2;
            ArrayList arrayList;
            boolean z3;
            boolean z4;
            long j2;
            boolean z5;
            long j3;
            int i2;
            int i3;
            int unsignedByte;
            boolean z6;
            boolean z7;
            boolean z9;
            long unsignedInt;
            boolean z10;
            long unsignedInt2;
            boolean z11;
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            boolean z12 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z2 = true;
            } else {
                z2 = true;
                z12 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z12) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                if ((unsignedByte2 & 128) != 0) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                if ((unsignedByte2 & 64) != 0) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                if ((unsignedByte2 & 32) != 0) {
                    z9 = z2;
                } else {
                    z9 = false;
                }
                if (z7) {
                    unsignedInt = parsableByteArray.readUnsignedInt();
                } else {
                    unsignedInt = -9223372036854775807L;
                }
                if (!z7) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i5 = 0;
                    while (i5 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt(), null));
                        i5++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    if ((128 & unsignedByte4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    unsignedInt2 = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z10 = z11;
                } else {
                    z10 = false;
                    unsignedInt2 = -9223372036854775807L;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z13 = z6;
                z5 = z10;
                z3 = z13;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j4 = unsignedInt;
                i2 = unsignedShort;
                i3 = unsignedByte5;
                long j5 = unsignedInt2;
                arrayList = arrayList2;
                z4 = z7;
                j2 = j4;
                j3 = j5;
            } else {
                arrayList = arrayList2;
                z3 = false;
                z4 = false;
                j2 = -9223372036854775807L;
                z5 = false;
                j3 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                unsignedByte = 0;
            }
            return new Event(unsignedInt3, z12, z3, z4, arrayList, j2, z5, j3, i2, i3, unsignedByte);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }

        j() {
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, j jVar) {
        this(parcel);
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.events.get(i3).writeToParcel(parcel);
        }
    }

    static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }
}
