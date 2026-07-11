package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Data {
    private static final String rl = Logger.J2("Data");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Data f42715t = new Builder().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map f42716n;

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map f42717n = new HashMap();

        public Builder O(String str, String str2) {
            this.f42717n.put(str, str2);
            return this;
        }

        public Data n() throws Throwable {
            Data data = new Data(this.f42717n);
            Data.gh(data);
            return data;
        }

        public Builder rl(String str, Object obj) {
            if (obj == null) {
                this.f42717n.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f42717n.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.f42717n.put(str, Data.n((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.f42717n.put(str, Data.rl((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.f42717n.put(str, Data.O((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.f42717n.put(str, Data.J2((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.f42717n.put(str, Data.nr((float[]) obj));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
            }
            this.f42717n.put(str, Data.t((double[]) obj));
            return this;
        }

        public Builder t(Data data) {
            nr(data.f42716n);
            return this;
        }

        public Builder nr(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                rl((String) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public Data(Data data) {
        this.f42716n = new HashMap(data.f42716n);
    }

    public static Long[] J2(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static Integer[] O(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Boolean[] n(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    public static Float[] nr(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static Byte[] rl(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = Byte.valueOf(bArr[i2]);
        }
        return bArr2;
    }

    public static Double[] t(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> setKeySet = this.f42716n.keySet();
        if (!setKeySet.equals(data.f42716n.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f42716n.get(str);
            Object obj3 = data.f42716n.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Data Uo(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e2;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i2 = objectInputStream.readInt(); i2 > 0; i2--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                        Log.e(rl, "Error in Data#fromByteArray: ", e3);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e4) {
                    e2 = e4;
                    Log.e(rl, "Error in Data#fromByteArray: ", e2);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                            Log.e(rl, "Error in Data#fromByteArray: ", e5);
                        }
                    }
                    byteArrayInputStream.close();
                } catch (ClassNotFoundException e6) {
                    e2 = e6;
                    Log.e(rl, "Error in Data#fromByteArray: ", e2);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                }
            } catch (IOException e7) {
                Log.e(rl, "Error in Data#fromByteArray: ", e7);
            }
        } catch (IOException e8) {
            e = e8;
            Throwable th2 = e;
            objectInputStream = null;
            e2 = th2;
            Log.e(rl, "Error in Data#fromByteArray: ", e2);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new Data(map);
        } catch (ClassNotFoundException e9) {
            e = e9;
            Throwable th22 = e;
            objectInputStream = null;
            e2 = th22;
            Log.e(rl, "Error in Data#fromByteArray: ", e2);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new Data(map);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e10) {
                    Log.e(rl, "Error in Data#fromByteArray: ", e10);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e11) {
                Log.e(rl, "Error in Data#fromByteArray: ", e11);
                throw th;
            }
        }
        return new Data(map);
    }

    public static byte[] gh(Data data) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            objectOutputStream.writeInt(data.mUb());
            for (Map.Entry entry : data.f42716n.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e3) {
                Log.e(rl, "Error in Data#toByteArray: ", e3);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                Log.e(rl, "Error in Data#toByteArray: ", e4);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e5) {
            e = e5;
            objectOutputStream2 = objectOutputStream;
            Log.e(rl, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    Log.e(rl, "Error in Data#toByteArray: ", e6);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                Log.e(rl, "Error in Data#toByteArray: ", e7);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(rl, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e9) {
                Log.e(rl, "Error in Data#toByteArray: ", e9);
                throw th;
            }
        }
    }

    public Map KN() {
        return Collections.unmodifiableMap(this.f42716n);
    }

    public int hashCode() {
        return this.f42716n.hashCode() * 31;
    }

    public int mUb() {
        return this.f42716n.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f42716n.isEmpty()) {
            for (String str : this.f42716n.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f42716n.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public String xMQ(String str) {
        Object obj = this.f42716n.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public Data(Map map) {
        this.f42716n = new HashMap(map);
    }
}
