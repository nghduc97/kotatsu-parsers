package org.koitharu.kotatsu.parsers.site.mangareader.pt

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("MANGASCHAN", "Mangaschan", "pt")
internal class Mangaschan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.MANGASCHAN, pageSize = 20, searchPageSize = 20) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("mangaschan.com")

	override val listUrl: String
		get() = "/manga"
	override val tableMode: Boolean
		get() = false

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMM d, yyyy", Locale("pt", "PT"))

}