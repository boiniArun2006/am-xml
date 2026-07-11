package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Compat f36716n;

    @RequiresApi
    private static final class Api31Impl {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final BuilderCompat f36717n;

        public ContentInfoCompat n() {
            return this.f36717n.build();
        }

        public Builder nr(Uri uri) {
            this.f36717n.n(uri);
            return this;
        }

        public Builder rl(Bundle bundle) {
            this.f36717n.setExtras(bundle);
            return this;
        }

        public Builder t(int i2) {
            this.f36717n.rl(i2);
            return this;
        }

        public Builder(ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f36717n = new BuilderCompat31Impl(clipData, i2);
            } else {
                this.f36717n = new BuilderCompatImpl(clipData, i2);
            }
        }
    }

    private interface BuilderCompat {
        ContentInfoCompat build();

        void n(Uri uri);

        void rl(int i2);

        void setExtras(Bundle bundle);
    }

    @RequiresApi
    private static final class BuilderCompat31Impl implements BuilderCompat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentInfo.Builder f36718n;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.f36718n.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void n(Uri uri) {
            this.f36718n.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void rl(int i2) {
            this.f36718n.setFlags(i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            this.f36718n.setExtras(bundle);
        }

        BuilderCompat31Impl(ClipData clipData, int i2) {
            this.f36718n = Ml.n(clipData, i2);
        }
    }

    private static final class BuilderCompatImpl implements BuilderCompat {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Bundle f36719O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ClipData f36720n;
        Uri nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f36721t;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void n(Uri uri) {
            this.nr = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void rl(int i2) {
            this.f36721t = i2;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public void setExtras(Bundle bundle) {
            this.f36719O = bundle;
        }

        BuilderCompatImpl(ClipData clipData, int i2) {
            this.f36720n = clipData;
            this.rl = i2;
        }
    }

    private interface Compat {
        int getSource();

        ClipData n();

        ContentInfo rl();

        int t();
    }

    @RequiresApi
    private static final class Compat31Impl implements Compat {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentInfo f36722n;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.f36722n.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData n() {
            return this.f36722n.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo rl() {
            return this.f36722n;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int t() {
            return this.f36722n.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f36722n + "}";
        }

        Compat31Impl(ContentInfo contentInfo) {
            this.f36722n = j.n(Preconditions.Uo(contentInfo));
        }
    }

    private static final class CompatImpl implements Compat {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Bundle f36723O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ClipData f36724n;
        private final Uri nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36725t;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ContentInfo rl() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int getSource() {
            return this.rl;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public ClipData n() {
            return this.f36724n;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public int t() {
            return this.f36725t;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f36724n.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.O(this.rl));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.n(this.f36725t));
            if (this.nr == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.nr.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f36723O != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }

        CompatImpl(BuilderCompatImpl builderCompatImpl) {
            this.f36724n = (ClipData) Preconditions.Uo(builderCompatImpl.f36720n);
            this.rl = Preconditions.t(builderCompatImpl.rl, 0, 5, "source");
            this.f36725t = Preconditions.J2(builderCompatImpl.f36721t, 1);
            this.nr = builderCompatImpl.nr;
            this.f36723O = builderCompatImpl.f36719O;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    static String O(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static ContentInfoCompat Uo(ContentInfo contentInfo) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo));
    }

    static String n(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    public ContentInfo J2() {
        ContentInfo contentInfoRl = this.f36716n.rl();
        Objects.requireNonNull(contentInfoRl);
        return j.n(contentInfoRl);
    }

    public int nr() {
        return this.f36716n.getSource();
    }

    public ClipData rl() {
        return this.f36716n.n();
    }

    public int t() {
        return this.f36716n.t();
    }

    public String toString() {
        return this.f36716n.toString();
    }

    ContentInfoCompat(Compat compat) {
        this.f36716n = compat;
    }
}
