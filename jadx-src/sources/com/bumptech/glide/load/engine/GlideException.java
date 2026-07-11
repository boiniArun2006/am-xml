package com.bumptech.glide.load.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final StackTraceElement[] f51580r = new StackTraceElement[0];
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Class f51581O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f51582n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CVL.j f51583t;

    private static final class j implements Appendable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Appendable f51584n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f51585t = true;

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f51585t) {
                this.f51585t = false;
                this.f51584n.append("  ");
            }
            this.f51585t = c2 == '\n';
            this.f51584n.append(c2);
            return this;
        }

        private CharSequence n(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        j(Appendable appendable) {
            this.f51584n = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceN = n(charSequence);
            return append(charSequenceN, 0, charSequenceN.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence charSequenceN = n(charSequence);
            boolean z2 = false;
            if (this.f51585t) {
                this.f51585t = false;
                this.f51584n.append("  ");
            }
            if (charSequenceN.length() > 0 && charSequenceN.charAt(i3 - 1) == '\n') {
                z2 = true;
            }
            this.f51585t = z2;
            this.f51584n.append(charSequenceN, i2, i3);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    private void n(Throwable th, List list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator it = ((GlideException) th).O().iterator();
        while (it.hasNext()) {
            n((Throwable) it.next(), list);
        }
    }

    public List J2() {
        ArrayList arrayList = new ArrayList();
        n(this, arrayList);
        return arrayList;
    }

    public List O() {
        return this.f51582n;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.J2);
        sb.append(this.f51581O != null ? ", " + this.f51581O : "");
        sb.append(this.f51583t != null ? ", " + this.f51583t : "");
        sb.append("");
        List<Throwable> listJ2 = J2();
        if (listJ2.isEmpty()) {
            return sb.toString();
        }
        if (listJ2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listJ2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listJ2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Uo(printStream);
    }

    private void Uo(Appendable appendable) {
        nr(this, appendable);
        rl(O(), new j(appendable));
    }

    private static void nr(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void rl(List list, Appendable appendable) {
        try {
            t(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void t(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).Uo(appendable);
            } else {
                nr(th, appendable);
            }
            i2 = i3;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        Uo(printWriter);
    }
}
