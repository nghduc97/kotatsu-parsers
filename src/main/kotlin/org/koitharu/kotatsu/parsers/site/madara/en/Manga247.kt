package org.koitharu.kotatsu.parsers.site.madara.pt


import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_247", "247MANGA", "en")
internal class Manga247(context: MangaLoaderContext) : MadaraParser(context, MangaSource.MANGA_247, "247manga.com") {
	override val tagPrefix = "manhwa-genre/"
}
