package org.koitharu.kotatsu.parsers.site.madara.ar

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATIME", "Manga Time", "ar")
internal class MangaTime(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.MANGATIME, "mangatime.co") {
	override val datePattern = "d MMMM، yyyy"
}
