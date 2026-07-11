package com.facebook.binaryresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements com.facebook.binaryresource.j {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f52342n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n rl(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new n(file, defaultConstructorMarker);
            }
            return null;
        }

        private j() {
        }

        public final n n(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new n(file, null);
        }
    }

    public /* synthetic */ n(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final n rl(File file) {
        return rl.n(file);
    }

    public static final n t(File file) {
        return rl.rl(file);
    }

    private n(File file) {
        this.f52342n = file;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        return Intrinsics.areEqual(this.f52342n, ((n) obj).f52342n);
    }

    public int hashCode() {
        return this.f52342n.hashCode();
    }

    @Override // com.facebook.binaryresource.j
    public InputStream n() {
        return new FileInputStream(this.f52342n);
    }

    public final File nr() {
        return this.f52342n;
    }

    @Override // com.facebook.binaryresource.j
    public long size() {
        return this.f52342n.length();
    }
}
