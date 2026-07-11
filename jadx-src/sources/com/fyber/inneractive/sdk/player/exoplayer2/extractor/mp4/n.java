package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.media3.common.MimeTypes;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import cS.Zv.SzFNXybiSxdx;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f55258a = z.a("nam");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55259b = z.a("trk");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55260c = z.a("cmt");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55261d = z.a("day");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55262e = z.a("ART");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55263f = z.a("too");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55264g = z.a("alb");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55265h = z.a("com");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f55266i = z.a("wrt");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55267j = z.a("lyr");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f55268k = z.a("gen");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f55269l = z.a("covr");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55270m = z.a("gnre");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55271n = z.a("grp");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55272o = z.a("disk");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f55273p = z.a("trkn");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f55274q = z.a("tmpo");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f55275r = z.a("cpil");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f55276s = z.a("aART");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f55277t = z.a("sonm");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f55278u = z.a("soal");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f55279v = z.a("soar");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f55280w = z.a("soaa");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f55281x = z.a("soco");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f55282y = z.a("rtng");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f55283z = z.a("pgap");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f55254A = z.a("sosn");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f55255B = z.a("tvsh");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f55256C = z.a("----");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f55257D = {"Blues", qfEYuUHwj.FdElPtwnpLoP, "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", SzFNXybiSxdx.NnSsSNLuPgsp, "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o a(int i2, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z2, boolean z3) {
        int iMin;
        nVar.e(nVar.f56207b + 4);
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f56207b + 8);
            iMin = nVar.j();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z3) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            return z2 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, Integer.toString(iMin)) : new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", str, Integer.toString(iMin));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + c.a(i2));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j b(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String strA = null;
        String strA2 = null;
        int i3 = -1;
        int i5 = -1;
        while (true) {
            int i7 = nVar.f56207b;
            if (i7 >= i2) {
                break;
            }
            int iB = nVar.b();
            int iB2 = nVar.b();
            nVar.e(nVar.f56207b + 4);
            if (iB2 == c.D0) {
                strA = nVar.a(iB - 12);
            } else if (iB2 == c.E0) {
                strA2 = nVar.a(iB - 12);
            } else {
                if (iB2 == c.F0) {
                    i3 = i7;
                    i5 = iB;
                }
                nVar.e(nVar.f56207b + (iB - 12));
            }
        }
        if (!"com.apple.iTunes".equals(strA) || !"iTunSMPB".equals(strA2) || i3 == -1) {
            return null;
        }
        nVar.e(i3);
        nVar.e(nVar.f56207b + 16);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", strA2, nVar.a(i5 - 16));
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f56207b + 8);
            String strA = nVar.a(iB - 16);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j("und", strA, strA);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + c.a(i2));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s b(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            nVar.e(nVar.f56207b + 8);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, nVar.a(iB - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + c.a(i2));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        int iB = nVar.b();
        if (nVar.b() == c.F0 && iB >= 22) {
            nVar.e(nVar.f56207b + 10);
            int iO = nVar.o();
            if (iO > 0) {
                String strA = com.fyber.inneractive.sdk.player.exoplayer2.m.a("", iO);
                int iO2 = nVar.o();
                if (iO2 > 0) {
                    strA = strA + "/" + iO2;
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s(str, null, strA);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + c.a(i2));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        int iB = nVar.b();
        if (nVar.b() == c.F0) {
            int iB2 = nVar.b() & 16777215;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? MimeTypes.IMAGE_PNG : null;
            }
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + iB2);
                return null;
            }
            nVar.e(nVar.f56207b + 4);
            int i2 = iB - 16;
            byte[] bArr = new byte[i2];
            nVar.a(bArr, 0, i2);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
