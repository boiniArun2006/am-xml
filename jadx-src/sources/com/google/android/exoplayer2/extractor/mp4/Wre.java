package com.google.android.exoplayer2.extractor.mp4;

import androidx.media3.common.MimeTypes;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String[] f57829n = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static Id3Frame O(ParsableByteArray parsableByteArray, int i2) {
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        int i3 = -1;
        int i5 = -1;
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i7 = parsableByteArray.readInt();
            int i8 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i8 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i7 - 12);
            } else if (i8 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i7 - 12);
            } else {
                if (i8 == 1684108385) {
                    i3 = position;
                    i5 = i7;
                }
                parsableByteArray.skipBytes(i7 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i3 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i3);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i5 - 16));
    }

    public static void gh(int i2, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i2 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    private static int mUb(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return parsableByteArray.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void qie(int i2, Metadata metadata, Metadata metadata2, Format.Builder builder, Metadata... metadataArr) {
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        if (i2 == 1) {
            if (metadata == null) {
                metadata = metadata3;
            }
        } else if (i2 == 2 && metadata2 != null) {
            for (int i3 = 0; i3 < metadata2.length(); i3++) {
                Metadata.Entry entry = metadata2.get(i3);
                if (entry instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                    if ("com.android.capture.fps".equals(mdtaMetadataEntry.key)) {
                        metadata = new Metadata(mdtaMetadataEntry);
                        break;
                    }
                }
            }
            metadata = metadata3;
        }
        for (Metadata metadata4 : metadataArr) {
            metadata = metadata.copyWithAppendedEntriesFrom(metadata4);
        }
        if (metadata.length() > 0) {
            builder.setMetadata(metadata);
        }
    }

    public static MdtaMetadataEntry J2(ParsableByteArray parsableByteArray, int i2, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position < i2) {
                int i3 = parsableByteArray.readInt();
                if (parsableByteArray.readInt() == 1684108385) {
                    int i5 = parsableByteArray.readInt();
                    int i7 = parsableByteArray.readInt();
                    int i8 = i3 - 16;
                    byte[] bArr = new byte[i8];
                    parsableByteArray.readBytes(bArr, 0, i8);
                    return new MdtaMetadataEntry(str, bArr, i7, i5);
                }
                parsableByteArray.setPosition(position + i3);
            } else {
                return null;
            }
        }
    }

    private static TextInformationFrame KN(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, null, parsableByteArray.readNullTerminatedString(i3 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + j.n(i2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextInformationFrame Uo(ParsableByteArray parsableByteArray) {
        String str;
        int iMUb = mUb(parsableByteArray);
        if (iMUb > 0) {
            String[] strArr = f57829n;
            if (iMUb <= strArr.length) {
                str = strArr[iMUb - 1];
            } else {
                str = null;
            }
        }
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static CommentFrame n(int i2, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            String nullTerminatedString = parsableByteArray.readNullTerminatedString(i3 - 16);
            return new CommentFrame("und", nullTerminatedString, nullTerminatedString);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + j.n(i2));
        return null;
    }

    private static TextInformationFrame nr(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i3 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                String str2 = "" + unsignedShort;
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + "/" + unsignedShort2;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + j.n(i2));
        return null;
    }

    private static ApicFrame rl(ParsableByteArray parsableByteArray) {
        String str;
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            int iRl = j.rl(parsableByteArray.readInt());
            if (iRl == 13) {
                str = "image/jpeg";
            } else if (iRl == 14) {
                str = MimeTypes.IMAGE_PNG;
            } else {
                str = null;
            }
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + iRl);
                return null;
            }
            parsableByteArray.skipBytes(4);
            int i3 = i2 - 16;
            byte[] bArr = new byte[i3];
            parsableByteArray.readBytes(bArr, 0, i3);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static Metadata.Entry t(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int i2 = parsableByteArray.readInt();
        int i3 = (i2 >> 24) & 255;
        try {
            if (i3 != 169 && i3 != 253) {
                if (i2 == 1735291493) {
                    return Uo(parsableByteArray);
                }
                if (i2 == 1684632427) {
                    return nr(i2, "TPOS", parsableByteArray);
                }
                if (i2 == 1953655662) {
                    return nr(i2, "TRCK", parsableByteArray);
                }
                if (i2 == 1953329263) {
                    return xMQ(i2, "TBPM", parsableByteArray, true, false);
                }
                if (i2 == 1668311404) {
                    return xMQ(i2, "TCMP", parsableByteArray, true, true);
                }
                if (i2 == 1668249202) {
                    return rl(parsableByteArray);
                }
                if (i2 == 1631670868) {
                    return KN(i2, "TPE2", parsableByteArray);
                }
                if (i2 == 1936682605) {
                    return KN(i2, "TSOT", parsableByteArray);
                }
                if (i2 == 1936679276) {
                    return KN(i2, "TSO2", parsableByteArray);
                }
                if (i2 == 1936679282) {
                    return KN(i2, "TSOA", parsableByteArray);
                }
                if (i2 == 1936679265) {
                    return KN(i2, "TSOP", parsableByteArray);
                }
                if (i2 == 1936679791) {
                    return KN(i2, "TSOC", parsableByteArray);
                }
                if (i2 == 1920233063) {
                    return xMQ(i2, "ITUNESADVISORY", parsableByteArray, false, false);
                }
                if (i2 == 1885823344) {
                    return xMQ(i2, "ITUNESGAPLESS", parsableByteArray, false, true);
                }
                if (i2 == 1936683886) {
                    return KN(i2, "TVSHOWSORT", parsableByteArray);
                }
                if (i2 == 1953919848) {
                    return KN(i2, "TVSHOW", parsableByteArray);
                }
                if (i2 == 757935405) {
                    return O(parsableByteArray, position);
                }
            } else {
                int i5 = 16777215 & i2;
                if (i5 == 6516084) {
                    return n(i2, parsableByteArray);
                }
                if (i5 != 7233901 && i5 != 7631467) {
                    if (i5 != 6516589 && i5 != 7828084) {
                        if (i5 == 6578553) {
                            return KN(i2, "TDRC", parsableByteArray);
                        }
                        if (i5 == 4280916) {
                            return KN(i2, "TPE1", parsableByteArray);
                        }
                        if (i5 == 7630703) {
                            return KN(i2, "TSSE", parsableByteArray);
                        }
                        if (i5 == 6384738) {
                            return KN(i2, "TALB", parsableByteArray);
                        }
                        if (i5 == 7108978) {
                            return KN(i2, "USLT", parsableByteArray);
                        }
                        if (i5 == 6776174) {
                            return KN(i2, "TCON", parsableByteArray);
                        }
                        if (i5 == 6779504) {
                            return KN(i2, "TIT1", parsableByteArray);
                        }
                    } else {
                        return KN(i2, "TCOM", parsableByteArray);
                    }
                } else {
                    return KN(i2, "TIT2", parsableByteArray);
                }
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + j.n(i2));
            parsableByteArray.setPosition(position);
            return null;
        } finally {
            parsableByteArray.setPosition(position);
        }
    }

    private static Id3Frame xMQ(int i2, String str, ParsableByteArray parsableByteArray, boolean z2, boolean z3) {
        int iMUb = mUb(parsableByteArray);
        if (z3) {
            iMUb = Math.min(1, iMUb);
        }
        if (iMUb >= 0) {
            if (z2) {
                return new TextInformationFrame(str, null, Integer.toString(iMUb));
            }
            return new CommentFrame("und", str, Integer.toString(iMUb));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + j.n(i2));
        return null;
    }
}
