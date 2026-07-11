package EJn;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class aC {

    public static final class Ml implements Iterable, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f2286n;

        public Ml(Wre wre) {
            this.f2286n = wre;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new n(this.f2286n);
        }
    }

    public static final class j implements Iterator, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f2287n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f2288t;

        j(Wre wre) {
            this.f2288t = wre;
            this.f2287n = wre.nr();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2287n > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Wre next() {
            Wre wre = this.f2288t;
            int iNr = wre.nr();
            int i2 = this.f2287n;
            this.f2287n = i2 - 1;
            return wre.Uo(iNr - i2);
        }
    }

    public static final class n implements Iterator, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f2289n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f2290t;

        n(Wre wre) {
            this.f2290t = wre;
            this.f2289n = wre.nr();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2289n > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String next() {
            Wre wre = this.f2290t;
            int iNr = wre.nr();
            int i2 = this.f2289n;
            this.f2289n = i2 - 1;
            return wre.O(iNr - i2);
        }
    }

    public static final class w6 implements Iterable, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f2291n;

        public w6(Wre wre) {
            this.f2291n = wre;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new j(this.f2291n);
        }
    }

    public static final Iterable n(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return new w6(wre);
    }

    public static final Iterable rl(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return new Ml(wre);
    }
}
