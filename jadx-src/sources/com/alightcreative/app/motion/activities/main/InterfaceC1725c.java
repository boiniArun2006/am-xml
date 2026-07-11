package com.alightcreative.app.motion.activities.main;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface InterfaceC1725c {

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.c$Ml */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Ml implements InterfaceC1725c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f45429n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f45429n, ((Ml) obj).f45429n);
        }

        public int hashCode() {
            return this.f45429n.hashCode();
        }

        public String toString() {
            return "OpenLink(link=" + this.f45429n + ")";
        }

        public Ml(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f45429n = link;
        }

        public final String n() {
            return this.f45429n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.c$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j implements InterfaceC1725c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f45430n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 896440953;
        }

        public String toString() {
            return "Close";
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.c$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class n implements InterfaceC1725c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f45431n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f45431n, ((n) obj).f45431n);
        }

        public int hashCode() {
            return this.f45431n.hashCode();
        }

        public String toString() {
            return "Import(linkUri=" + this.f45431n + ")";
        }

        public n(Uri linkUri) {
            Intrinsics.checkNotNullParameter(linkUri, "linkUri");
            this.f45431n = linkUri;
        }

        public final Uri n() {
            return this.f45431n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.c$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class w6 implements InterfaceC1725c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f45432n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public int hashCode() {
            return 11735766;
        }

        public String toString() {
            return "OpenEditProfile";
        }
    }
}
