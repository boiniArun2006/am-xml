package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n extends TagPayloadReader {
    private long[] nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f57778t;

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean rl(ParsableByteArray parsableByteArray) {
        return true;
    }

    public n() {
        super(new DummyTrackOutput());
        this.rl = -9223372036854775807L;
        this.f57778t = new long[0];
        this.nr = new long[0];
    }

    private static Object KN(ParsableByteArray parsableByteArray, int i2) {
        if (i2 == 0) {
            return mUb(parsableByteArray);
        }
        if (i2 == 1) {
            return Uo(parsableByteArray);
        }
        if (i2 == 2) {
            return ty(parsableByteArray);
        }
        if (i2 == 3) {
            return qie(parsableByteArray);
        }
        if (i2 == 8) {
            return gh(parsableByteArray);
        }
        if (i2 == 10) {
            return az(parsableByteArray);
        }
        if (i2 != 11) {
            return null;
        }
        return xMQ(parsableByteArray);
    }

    private static HashMap qie(ParsableByteArray parsableByteArray) {
        HashMap map = new HashMap();
        while (true) {
            String strTy = ty(parsableByteArray);
            int iHI = HI(parsableByteArray);
            if (iHI == 9) {
                return map;
            }
            Object objKN = KN(parsableByteArray, iHI);
            if (objKN != null) {
                map.put(strTy, objKN);
            }
        }
    }

    private static Date xMQ(ParsableByteArray parsableByteArray) {
        Date date = new Date((long) mUb(parsableByteArray).doubleValue());
        parsableByteArray.skipBytes(2);
        return date;
    }

    public long[] J2() {
        return this.f57778t;
    }

    public long[] O() {
        return this.nr;
    }

    public long nr() {
        return this.rl;
    }

    private static int HI(ParsableByteArray parsableByteArray) {
        return parsableByteArray.readUnsignedByte();
    }

    private static Boolean Uo(ParsableByteArray parsableByteArray) {
        boolean z2 = true;
        if (parsableByteArray.readUnsignedByte() != 1) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private static ArrayList az(ParsableByteArray parsableByteArray) {
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        ArrayList arrayList = new ArrayList(unsignedIntToInt);
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            Object objKN = KN(parsableByteArray, HI(parsableByteArray));
            if (objKN != null) {
                arrayList.add(objKN);
            }
        }
        return arrayList;
    }

    private static HashMap gh(ParsableByteArray parsableByteArray) {
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap map = new HashMap(unsignedIntToInt);
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            String strTy = ty(parsableByteArray);
            Object objKN = KN(parsableByteArray, HI(parsableByteArray));
            if (objKN != null) {
                map.put(strTy, objKN);
            }
        }
        return map;
    }

    private static Double mUb(ParsableByteArray parsableByteArray) {
        return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
    }

    private static String ty(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return new String(parsableByteArray.getData(), position, unsignedShort);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean t(ParsableByteArray parsableByteArray, long j2) {
        if (HI(parsableByteArray) != 2 || !"onMetaData".equals(ty(parsableByteArray)) || parsableByteArray.bytesLeft() == 0 || HI(parsableByteArray) != 8) {
            return false;
        }
        HashMap mapGh = gh(parsableByteArray);
        Object obj = mapGh.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.rl = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapGh.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f57778t = new long[size];
                this.nr = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f57778t[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.nr[i2] = ((Double) obj5).longValue();
                    } else {
                        this.f57778t = new long[0];
                        this.nr = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
