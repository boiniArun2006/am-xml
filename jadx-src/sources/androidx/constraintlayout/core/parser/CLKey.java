package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CLKey extends CLContainer {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static ArrayList f35324Z;

    static {
        ArrayList arrayList = new ArrayList();
        f35324Z = arrayList;
        arrayList.add("ConstraintSets");
        f35324Z.add("Variables");
        f35324Z.add("Generate");
        f35324Z.add("Transitions");
        f35324Z.add("KeyFrames");
        f35324Z.add("KeyAttributes");
        f35324Z.add("KeyPositions");
        f35324Z.add("KeyCycles");
    }

    public static CLElement U(char[] cArr) {
        return new CLKey(cArr);
    }

    public static CLElement Xw(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.ck(0L);
        cLKey.ty(str.length() - 1);
        cLKey.E(cLElement);
        return cLKey;
    }

    public void E(CLElement cLElement) {
        if (this.f35319o.size() > 0) {
            this.f35319o.set(0, cLElement);
        } else {
            this.f35319o.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String Ik() {
        if (this.f35319o.size() <= 0) {
            return O() + t() + ": <> ";
        }
        return O() + t() + ": " + ((CLElement) this.f35319o.get(0)).Ik();
    }

    public CLElement M7() {
        if (this.f35319o.size() > 0) {
            return (CLElement) this.f35319o.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(P5(), ((CLKey) obj).P5())) {
            return super.equals(obj);
        }
        return false;
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public String P5() {
        return t();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }
}
