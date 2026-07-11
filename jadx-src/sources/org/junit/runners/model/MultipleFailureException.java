package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class MultipleFailureException extends Exception {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f71594n;

    @Override // java.lang.Throwable
    public void printStackTrace() {
        Iterator it = this.f71594n.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f71594n.size())));
        for (Throwable th : this.f71594n) {
            sb.append(String.format("%n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Iterator it = this.f71594n.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Iterator it = this.f71594n.iterator();
        while (it.hasNext()) {
            ((Throwable) it.next()).printStackTrace(printWriter);
        }
    }
}
