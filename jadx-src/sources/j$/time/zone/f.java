package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long[] f69212i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e[] f69213j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f69214k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b[] f69215l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f69216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f69217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f69218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f69219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f69220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e[] f69221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeZone f69222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f69223h = new ConcurrentHashMap();

    public static f i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f69216a = jArr;
        this.f69217b = zoneOffsetArr;
        this.f69218c = jArr2;
        this.f69220e = zoneOffsetArr2;
        this.f69221f = eVarArr;
        if (jArr2.length == 0) {
            this.f69219d = f69214k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.a0()) {
                    arrayList.add(bVar.s());
                    arrayList.add(bVar.q());
                } else {
                    arrayList.add(bVar.q());
                    arrayList.add(bVar.s());
                }
                i2 = i3;
            }
            this.f69219d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f69222g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f69217b = zoneOffsetArr;
        long[] jArr = f69212i;
        this.f69216a = jArr;
        this.f69218c = jArr;
        this.f69219d = f69214k;
        this.f69220e = zoneOffsetArr;
        this.f69221f = f69213j;
        this.f69222g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.f69217b = zoneOffsetArr;
        long[] jArr = f69212i;
        this.f69216a = jArr;
        this.f69218c = jArr;
        this.f69219d = f69214k;
        this.f69220e = zoneOffsetArr;
        this.f69221f = f69213j;
        this.f69222g = timeZone;
    }

    private static ZoneOffset j(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f69222g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f69216a;
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f69217b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f69218c;
        objectOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f69220e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f69221f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void l(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f69222g.getID());
    }

    static f k(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        long[] jArr = f69212i;
        long[] jArr2 = i2 == 0 ? jArr : new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr2[i3] = a.a(objectInput);
        }
        int i5 = i2 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            zoneOffsetArr[i7] = a.b(objectInput);
        }
        int i8 = objectInput.readInt();
        if (i8 != 0) {
            jArr = new long[i8];
        }
        long[] jArr3 = jArr;
        for (int i9 = 0; i9 < i8; i9++) {
            jArr3[i9] = a.a(objectInput);
        }
        int i10 = i8 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zoneOffsetArr2[i11] = a.b(objectInput);
        }
        int i12 = objectInput.readByte();
        e[] eVarArr = i12 == 0 ? f69213j : new e[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            eVarArr[i13] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f69222g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f69218c;
        if (jArr.length == 0) {
            return this.f69217b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f69221f.length;
        ZoneOffset[] zoneOffsetArr = this.f69220e;
        if (length > 0 && epochSecond > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                bVar = bVarArrB[i2];
                if (epochSecond < bVar.T()) {
                    return bVar.X();
                }
            }
            return bVar.L();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return ((b) objE).Y();
        }
        return Collections.singletonList((ZoneOffset) objE);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f69217b;
        int i2 = 0;
        TimeZone timeZone = this.f69222g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.X());
            if (bVarArrB.length == 0) {
                return j(timeZone.getOffset(localDateTime.toEpochSecond(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.X())) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.f69218c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f69221f.length;
        LocalDateTime[] localDateTimeArr = this.f69219d;
        if (length2 > 0 && localDateTime.Y(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.X());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.X())) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f69220e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            int i5 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i5];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i5 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(iBinarySearch / 2) + 1];
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeS = bVar.s();
        if (bVar.a0()) {
            if (localDateTime.a0(localDateTimeS)) {
                return bVar.X();
            }
            if (!localDateTime.a0(bVar.q())) {
                return bVar.L();
            }
        } else {
            if (!localDateTime.a0(localDateTimeS)) {
                return bVar.L();
            }
            if (localDateTime.a0(bVar.q())) {
                return bVar.X();
            }
        }
        return bVar;
    }

    private b[] b(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.f69223h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f69222g;
        if (timeZone != null) {
            b[] bVarArr2 = f69215l;
            if (i2 < 1800) {
                return bVarArr2;
            }
            long epochSecond = LocalDateTime.d0(i2 - 1).toEpochSecond(this.f69217b[0]);
            long j2 = 1000;
            int offset = timeZone.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = 7776000 + epochSecond;
                long j5 = j2;
                if (offset != timeZone.getOffset(j4 * j5)) {
                    while (j4 - epochSecond > 1) {
                        int i3 = offset;
                        long jFloorDiv = Math.floorDiv(j4 + epochSecond, 2L);
                        if (timeZone.getOffset(jFloorDiv * j5) == i3) {
                            epochSecond = jFloorDiv;
                        } else {
                            j4 = jFloorDiv;
                        }
                        offset = i3;
                    }
                    int i5 = offset;
                    if (timeZone.getOffset(epochSecond * j5) == i5) {
                        epochSecond = j4;
                    }
                    ZoneOffset zoneOffsetJ = j(i5);
                    offset = timeZone.getOffset(epochSecond * j5);
                    ZoneOffset zoneOffsetJ2 = j(offset);
                    if (c(epochSecond, zoneOffsetJ2) == i2) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(epochSecond, zoneOffsetJ, zoneOffsetJ2);
                    }
                } else {
                    epochSecond = j4;
                }
                j2 = j5;
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f69221f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            bVarArr3[i7] = eVarArr[i7].a(i2);
        }
        if (i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffsetJ;
        TimeZone timeZone = this.f69222g;
        if (timeZone != null) {
            zoneOffsetJ = j(timeZone.getRawOffset());
        } else {
            int length = this.f69218c.length;
            ZoneOffset[] zoneOffsetArr = this.f69217b;
            if (length == 0) {
                zoneOffsetJ = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f69216a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetJ = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetJ.equals(d(instant));
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j2 + ((long) zoneOffset.getTotalSeconds()), 86400)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f69222g, fVar.f69222g) && Arrays.equals(this.f69216a, fVar.f69216a) && Arrays.equals(this.f69217b, fVar.f69217b) && Arrays.equals(this.f69218c, fVar.f69218c) && Arrays.equals(this.f69220e, fVar.f69220e) && Arrays.equals(this.f69221f, fVar.f69221f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f69222g) ^ Arrays.hashCode(this.f69216a)) ^ Arrays.hashCode(this.f69217b)) ^ Arrays.hashCode(this.f69218c)) ^ Arrays.hashCode(this.f69220e)) ^ Arrays.hashCode(this.f69221f);
    }

    public final String toString() {
        TimeZone timeZone = this.f69222g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f69217b[r1.length - 1] + "]";
    }
}
