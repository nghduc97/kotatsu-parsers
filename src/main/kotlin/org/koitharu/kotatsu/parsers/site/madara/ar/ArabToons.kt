package org.koitharu.kotatsu.parsers.site.madara.pt


import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("ARABTOONS", "Arab Toons", "ar")
internal class ArabToons(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.ARABTOONS, "arabtoons.net") {

	override val isNsfwSource = true
	override val datePattern = "dd-MM-yyyy"
}