package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.DAz;
import com.google.firebase.firestore.remote.nKK;
import io.grpc.SPz;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Pl {
    static final Set nr = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final r f60390n;
    private final wqP.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QJ f60391t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f60392n;

        static {
            int[] iArr = new int[FirebaseFirestoreException.j.values().length];
            f60392n = iArr;
            try {
                iArr[FirebaseFirestoreException.j.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.f60320g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60392n[FirebaseFirestoreException.j.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static boolean nr(FirebaseFirestoreException.j jVar) {
        switch (j.f60392n[jVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + jVar);
        }
    }

    nKK n(nKK.j jVar) {
        return new nKK(this.f60391t, this.rl, this.f60390n, jVar);
    }

    DAz rl(DAz.j jVar) {
        return new DAz(this.f60391t, this.rl, this.f60390n, jVar);
    }

    Pl(wqP.I28 i28, r rVar, QJ qj) {
        this.rl = i28;
        this.f60390n = rVar;
        this.f60391t = qj;
    }

    public static boolean J2(io.grpc.SPz sPz) {
        if (O(sPz) && !sPz.az().equals(SPz.n.ABORTED)) {
            return true;
        }
        return false;
    }

    public static boolean O(io.grpc.SPz sPz) {
        return nr(FirebaseFirestoreException.j.t(sPz.az().t()));
    }

    public static boolean t(io.grpc.SPz sPz) {
        sPz.az();
        Throwable thQie = sPz.qie();
        if (thQie instanceof SSLHandshakeException) {
            thQie.getMessage().contains("no ciphers available");
            return false;
        }
        return false;
    }
}
