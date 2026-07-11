package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class FontResourcesParserCompat {

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FontFileResourceEntry[] f36360n;

        public FontFileResourceEntry[] n() {
            return this.f36360n;
        }

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.f36360n = fontFileResourceEntryArr;
        }
    }

    public static final class FontFileResourceEntry {
        private final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f36361O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f36362n;
        private final String nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f36363t;

        public boolean J2() {
            return this.f36363t;
        }

        public int O() {
            return this.rl;
        }

        public String n() {
            return this.f36362n;
        }

        public String nr() {
            return this.nr;
        }

        public int rl() {
            return this.J2;
        }

        public int t() {
            return this.f36361O;
        }

        public FontFileResourceEntry(String str, int i2, boolean z2, String str2, int i3, int i5) {
            this.f36362n = str;
            this.rl = i2;
            this.f36363t = z2;
            this.nr = str2;
            this.f36361O = i3;
            this.J2 = i5;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f36364O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FontRequest f36365n;
        private final int nr;
        private final FontRequest rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36366t;

        public int O() {
            return this.f36366t;
        }

        public FontRequest n() {
            return this.rl;
        }

        public String nr() {
            return this.f36364O;
        }

        public int rl() {
            return this.nr;
        }

        public FontRequest t() {
            return this.f36365n;
        }

        public ProviderResourceEntry(FontRequest fontRequest, FontRequest fontRequest2, int i2, int i3, String str) {
            this.f36365n = fontRequest;
            this.rl = fontRequest2;
            this.nr = i2;
            this.f36366t = i3;
            this.f36364O = str;
        }
    }

    private static void Uo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static FamilyResourceEntry nr(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return O(xmlPullParser, resources);
        }
        Uo(xmlPullParser);
        return null;
    }

    @RequiresApi
    static class Api21Impl {
        static int n(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    private static List KN(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static FamilyResourceEntry O(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.KN);
        String string = typedArrayObtainAttributes.getString(R.styleable.xMQ);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.ty);
        String string3 = typedArrayObtainAttributes.getString(R.styleable.HI);
        String string4 = typedArrayObtainAttributes.getString(R.styleable.gh);
        int resourceId = typedArrayObtainAttributes.getResourceId(R.styleable.mUb, 0);
        int integer = typedArrayObtainAttributes.getInteger(R.styleable.qie, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(R.styleable.az, 500);
        String string5 = typedArrayObtainAttributes.getString(R.styleable.ck);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                Uo(xmlPullParser);
            }
            List listT = t(resources, resourceId);
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, listT), string4 != null ? new FontRequest(string, string2, string4, listT) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(J2(xmlPullParser, resources));
                } else {
                    Uo(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    public static List t(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (n(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(KN(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(KN(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static FontFileResourceEntry J2(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z2;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Ik);
        int i2 = R.styleable.nY;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = R.styleable.f36186o;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);
        int i5 = R.styleable.aYN;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = R.styleable.f36182Z;
        }
        if (1 == typedArrayObtainAttributes.getInt(i5, 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i7 = R.styleable.f36184g;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = R.styleable.XQ;
        }
        int i8 = R.styleable.ViF;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = R.styleable.f36179S;
        }
        String string = typedArrayObtainAttributes.getString(i8);
        int i9 = typedArrayObtainAttributes.getInt(i7, 0);
        int i10 = R.styleable.WPU;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = R.styleable.f36187r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i10, 0);
        String string2 = typedArrayObtainAttributes.getString(i10);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            Uo(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i3, z2, string, i9, resourceId);
    }

    private static int n(TypedArray typedArray, int i2) {
        return Api21Impl.n(typedArray, i2);
    }

    public static FamilyResourceEntry rl(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return nr(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
