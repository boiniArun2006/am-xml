package com.google.firebase.firestore;

import android.util.SparseArray;
import com.google.firebase.FirebaseException;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseFirestoreException extends FirebaseException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f60311n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public enum j {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        f60320g(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private static final SparseArray P5 = rl();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f60325n;

        private static SparseArray rl() {
            SparseArray sparseArray = new SparseArray();
            for (j jVar : values()) {
                j jVar2 = (j) sparseArray.get(jVar.nr());
                if (jVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + jVar2 + "&" + jVar.name());
                }
                sparseArray.put(jVar.nr(), jVar);
            }
            return sparseArray;
        }

        public static j t(int i2) {
            return (j) P5.get(i2, UNKNOWN);
        }

        public int nr() {
            return this.f60325n;
        }

        j(int i2) {
            this.f60325n = i2;
        }
    }

    public FirebaseFirestoreException(String str, j jVar) {
        super(str);
        AbstractC2418c.t(str, "Provided message must not be null.");
        wqP.n.t(jVar != j.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f60311n = (j) AbstractC2418c.t(jVar, "Provided code must not be null.");
    }

    public FirebaseFirestoreException(String str, j jVar, Throwable th) {
        super(str, th);
        AbstractC2418c.t(str, "Provided message must not be null.");
        wqP.n.t(jVar != j.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f60311n = (j) AbstractC2418c.t(jVar, "Provided code must not be null.");
    }
}
