package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.afx;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class C extends afx {
    protected final File J2;
    protected final String Uo;

    protected static final class j extends afx.w6 implements Comparable {
        final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final ZipEntry f53009O;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (this.f53009O.equals(jVar.f53009O) && this.J2 == jVar.J2) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.J2 * 31) + this.f53009O.hashCode();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(j jVar) {
            return this.f53035n.compareTo(jVar.f53035n);
        }

        j(String str, ZipEntry zipEntry, int i2) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f53009O = zipEntry;
            this.J2 = i2;
        }
    }

    protected class n extends afx.I28 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final afx f53010O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected j[] f53011n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ZipFile f53012t;

        abstract j[] T();

        n(afx afxVar) {
            this.f53012t = new ZipFile(C.this.J2);
            this.f53010O = afxVar;
        }

        j[] Z() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(C.this.Uo);
            String[] strArrMUb = SysUtil.mUb();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f53012t.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    int iO = SysUtil.O(strArrMUb, strGroup);
                    if (iO >= 0) {
                        linkedHashSet.add(strGroup);
                        j jVar = (j) map.get(strGroup2);
                        if (jVar == null || iO < jVar.J2) {
                            map.put(strGroup2, new j(strGroup2, zipEntryNextElement, iO));
                        }
                    }
                }
            }
            this.f53010O.o((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            j[] jVarArr = (j[]) map.values().toArray(new j[map.size()]);
            Arrays.sort(jVarArr);
            return jVarArr;
        }

        @Override // com.facebook.soloader.afx.I28, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f53012t.close();
        }

        @Override // com.facebook.soloader.afx.I28
        public void Uo(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (j jVar : T()) {
                InputStream inputStream = this.f53012t.getInputStream(jVar.f53009O);
                try {
                    afx.Ml ml = new afx.Ml(jVar, inputStream);
                    inputStream = null;
                    try {
                        n(ml, bArr, file);
                        ml.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        @Override // com.facebook.soloader.afx.I28
        public final afx.w6[] rl() {
            return T();
        }
    }

    public C(Context context, String str, File file, String str2) {
        super(context, str);
        this.J2 = file;
        this.Uo = str2;
    }
}
