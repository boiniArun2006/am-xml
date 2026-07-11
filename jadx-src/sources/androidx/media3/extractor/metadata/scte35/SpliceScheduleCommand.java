package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class SpliceScheduleCommand extends SpliceCommand {
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i2, long j2) {
            this.componentTag = i2;
            this.utcSpliceTime = j2;
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
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
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
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i2 = 0; i2 < unsignedByte; i2++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }
}
