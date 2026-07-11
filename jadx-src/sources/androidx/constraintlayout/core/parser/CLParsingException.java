package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f35337O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f35338n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f35339t;

    public String n() {
        return this.f35338n + " (" + this.f35337O + " at line " + this.f35339t + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + n();
    }

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.f35338n = str;
        if (cLElement != null) {
            this.f35337O = cLElement.mUb();
            this.f35339t = cLElement.xMQ();
        } else {
            this.f35337O = "unknown";
            this.f35339t = 0;
        }
    }
}
