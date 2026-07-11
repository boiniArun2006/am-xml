package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    private static class CLObjectIterator implements Iterator<CLKey> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        CLObject f35326n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35327t = 0;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35327t < this.f35326n.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public CLKey next() {
            CLKey cLKey = (CLKey) this.f35326n.f35319o.get(this.f35327t);
            this.f35327t++;
            return cLKey;
        }

        CLObjectIterator(CLObject cLObject) {
            this.f35326n = cLObject;
        }
    }

    public static CLObject Xw(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String Ik() {
        StringBuilder sb = new StringBuilder(O() + "{ ");
        boolean z2 = true;
        for (CLElement cLElement : this.f35319o) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(cLElement.Ik());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CLObject rl() {
        return (CLObject) super.clone();
    }
}
