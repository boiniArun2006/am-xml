package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CLContainer extends CLElement {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f35319o;

    public CLElement E2(String str) {
        Iterator it = this.f35319o.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.t().equals(str)) {
                return cLKey.M7();
            }
        }
        return null;
    }

    public CLElement S(String str) throws CLParsingException {
        Iterator it = this.f35319o.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.t().equals(str)) {
                return cLKey.M7();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public CLElement XQ(int i2) throws CLParsingException {
        if (i2 >= 0 && i2 < this.f35319o.size()) {
            return (CLElement) this.f35319o.get(i2);
        }
        throw new CLParsingException("no element at index " + i2, this);
    }

    public void bzg(String str) {
        ArrayList arrayList = new ArrayList();
        for (CLElement cLElement : this.f35319o) {
            if (((CLKey) cLElement).t().equals(str)) {
                arrayList.add(cLElement);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f35319o.remove((CLElement) it.next());
        }
    }

    public void clear() {
        this.f35319o.clear();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.f35319o.equals(((CLContainer) obj).f35319o);
        }
        return false;
    }

    public CLElement fD(int i2) {
        if (i2 < 0 || i2 >= this.f35319o.size()) {
            return null;
        }
        return (CLElement) this.f35319o.get(i2);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.f35319o, Integer.valueOf(super.hashCode()));
    }

    public boolean nHg(String str) {
        for (CLElement cLElement : this.f35319o) {
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).t().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void r(CLElement cLElement) {
        this.f35319o.add(cLElement);
        if (CLParser.nr) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public void rV9(String str, String str2) {
        CLString cLString = new CLString(str2.toCharArray());
        cLString.ck(0L);
        cLString.ty(str2.length() - 1);
        wTp(str, cLString);
    }

    public ArrayList s7N() {
        ArrayList arrayList = new ArrayList();
        for (CLElement cLElement : this.f35319o) {
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).t());
            }
        }
        return arrayList;
    }

    public int size() {
        return this.f35319o.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CLElement cLElement : this.f35319o) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public void v(String str, float f3) {
        wTp(str, new CLNumber(f3));
    }

    public void wTp(String str, CLElement cLElement) {
        Iterator it = this.f35319o.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.t().equals(str)) {
                cLKey.E(cLElement);
                return;
            }
        }
        this.f35319o.add((CLKey) CLKey.Xw(str, cLElement));
    }

    public CLContainer(char[] cArr) {
        super(cArr);
        this.f35319o = new ArrayList();
    }

    public String N(String str) {
        CLElement cLElementE2 = E2(str);
        if (cLElementE2 instanceof CLString) {
            return cLElementE2.t();
        }
        return null;
    }

    public String T(int i2) {
        CLElement cLElementFD = fD(i2);
        if (cLElementFD instanceof CLString) {
            return cLElementFD.t();
        }
        return null;
    }

    public float ViF(String str) throws CLParsingException {
        CLElement cLElementS = S(str);
        if (cLElementS != null) {
            return cLElementS.J2();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + cLElementS.mUb() + "] : " + cLElementS, this);
    }

    public CLArray WPU(String str) throws CLParsingException {
        CLElement cLElementS = S(str);
        if (cLElementS instanceof CLArray) {
            return (CLArray) cLElementS;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + cLElementS.mUb() + "] : " + cLElementS, this);
    }

    public String X(String str) throws CLParsingException {
        String strMUb;
        CLElement cLElementS = S(str);
        if (cLElementS instanceof CLString) {
            return cLElementS.t();
        }
        if (cLElementS != null) {
            strMUb = cLElementS.mUb();
        } else {
            strMUb = null;
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + strMUb + "] : " + cLElementS, this);
    }

    public CLArray aYN(String str) {
        CLElement cLElementE2 = E2(str);
        if (cLElementE2 instanceof CLArray) {
            return (CLArray) cLElementE2;
        }
        return null;
    }

    public String e(int i2) throws CLParsingException {
        CLElement cLElementXQ = XQ(i2);
        if (cLElementXQ instanceof CLString) {
            return cLElementXQ.t();
        }
        throw new CLParsingException("no string at index " + i2, this);
    }

    public int g(String str) throws CLParsingException {
        CLElement cLElementS = S(str);
        if (cLElementS != null) {
            return cLElementS.KN();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + cLElementS.mUb() + "] : " + cLElementS, this);
    }

    public float getFloat(int i2) throws CLParsingException {
        CLElement cLElementXQ = XQ(i2);
        if (cLElementXQ != null) {
            return cLElementXQ.J2();
        }
        throw new CLParsingException("no float at index " + i2, this);
    }

    public int getInt(int i2) throws CLParsingException {
        CLElement cLElementXQ = XQ(i2);
        if (cLElementXQ != null) {
            return cLElementXQ.KN();
        }
        throw new CLParsingException("no int at index " + i2, this);
    }

    public CLObject iF(String str) {
        CLElement cLElementE2 = E2(str);
        if (cLElementE2 instanceof CLObject) {
            return (CLObject) cLElementE2;
        }
        return null;
    }

    public float nY(String str) {
        CLElement cLElementE2 = E2(str);
        if (cLElementE2 instanceof CLNumber) {
            return cLElementE2.J2();
        }
        return Float.NaN;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CLContainer rl() {
        CLContainer cLContainer = (CLContainer) super.rl();
        ArrayList arrayList = new ArrayList(this.f35319o.size());
        Iterator it = this.f35319o.iterator();
        while (it.hasNext()) {
            CLElement cLElementRl = ((CLElement) it.next()).rl();
            cLElementRl.az(cLContainer);
            arrayList.add(cLElementRl);
        }
        cLContainer.f35319o = arrayList;
        return cLContainer;
    }

    public CLObject te(String str) throws CLParsingException {
        CLElement cLElementS = S(str);
        if (cLElementS instanceof CLObject) {
            return (CLObject) cLElementS;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + cLElementS.mUb() + "] : " + cLElementS, this);
    }
}
