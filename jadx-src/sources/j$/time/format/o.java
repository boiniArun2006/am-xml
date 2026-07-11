package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f69075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f69076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected char f69077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected o f69078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected o f69079e;

    /* synthetic */ o(String str, String str2, o oVar, int i2) {
        this(str, str2, oVar);
    }

    protected boolean c(char c2, char c4) {
        return c2 == c4;
    }

    private o(String str, String str2, o oVar) {
        this.f69075a = str;
        this.f69076b = str2;
        this.f69078d = oVar;
        if (str.isEmpty()) {
            this.f69077c = CharCompanionObject.MAX_VALUE;
        } else {
            this.f69077c = this.f69075a.charAt(0);
        }
    }

    public static o f(w wVar) {
        return wVar.k() ? new o("", null, null) : new n("", null, null);
    }

    public static o g(Set set, w wVar) {
        o oVarF = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            oVarF.b(str, str);
        }
        return oVarF;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f69075a.length() + index;
        o oVar = this.f69078d;
        if (oVar != null && length2 != length) {
            while (true) {
                if (c(oVar.f69077c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strD = oVar.d(charSequence, parsePosition);
                    if (strD != null) {
                        return strD;
                    }
                } else {
                    oVar = oVar.f69079e;
                    if (oVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f69076b;
    }

    protected o e(String str, String str2, o oVar) {
        return new o(str, str2, oVar);
    }

    protected boolean h(CharSequence charSequence, int i2, int i3) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f69075a, i2);
        }
        int length = this.f69075a.length();
        if (length > i3 - i2) {
            return false;
        }
        int i5 = 0;
        while (true) {
            int i7 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i8 = i5 + 1;
            int i9 = i2 + 1;
            if (!c(this.f69075a.charAt(i5), charSequence.charAt(i2))) {
                return false;
            }
            i2 = i9;
            length = i7;
            i5 = i8;
        }
    }

    private boolean b(String str, String str2) {
        int i2 = 0;
        while (i2 < str.length() && i2 < this.f69075a.length() && c(str.charAt(i2), this.f69075a.charAt(i2))) {
            i2++;
        }
        if (i2 == this.f69075a.length()) {
            if (i2 < str.length()) {
                String strSubstring = str.substring(i2);
                for (o oVar = this.f69078d; oVar != null; oVar = oVar.f69079e) {
                    if (c(oVar.f69077c, strSubstring.charAt(0))) {
                        return oVar.b(strSubstring, str2);
                    }
                }
                o oVarE = e(strSubstring, str2, null);
                oVarE.f69079e = this.f69078d;
                this.f69078d = oVarE;
                return true;
            }
            this.f69076b = str2;
            return true;
        }
        o oVarE2 = e(this.f69075a.substring(i2), this.f69076b, this.f69078d);
        this.f69075a = str.substring(0, i2);
        this.f69078d = oVarE2;
        if (i2 < str.length()) {
            this.f69078d.f69079e = e(str.substring(i2), str2, null);
            this.f69076b = null;
            return true;
        }
        this.f69076b = str2;
        return true;
    }
}
