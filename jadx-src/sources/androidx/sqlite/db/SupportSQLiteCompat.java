package androidx.sqlite.db;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class SupportSQLiteCompat {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", c.f62177j, "(Landroid/content/Context;)Ljava/io/File;", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api21Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api21Impl f42002n = new Api21Impl();

        public static final File n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }

        private Api21Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 16.")
    @RestrictTo
    public static final class Api16Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api16Impl f42000n = new Api16Impl();

        private Api16Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 19.")
    @RestrictTo
    public static final class Api19Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api19Impl f42001n = new Api19Impl();

        private Api19Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api23Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api23Impl f42003n = new Api23Impl();

        private Api23Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "<init>", "()V", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api29Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api29Impl f42004n = new Api29Impl();

        private Api29Impl() {
        }
    }
}
