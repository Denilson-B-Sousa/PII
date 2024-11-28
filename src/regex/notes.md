[abc] - A single digit or character
[a-z] - A single character in a range A to Z
a|b -   Matcher either A or B
\d -    A digit: [0-9]
\w -    A word character: [a-z A-Z 0-9]
-       Any single Character
- a{3}  Exactly 3 of a: aaa
- a{3, } 3 or more of a
- a{2,4} between 2 or 4 of a: aa, aaa or aaaa
- ^     The beginning of a line
- *     Matches zero or more occurrences
- +     Matches one or more occurrences
- ?     Matches zero or one occurrences

# Limites e Âncoras

### *: início da linha ou string
### $: Fim da linha ou string
### \b: Limite de palavra
### \B: Não-limite de palavra
### \A: Início absoluto da string
### \G: Fim da última correspondência
### \Z: Fim da string (exceto nova linha final)
### \z: Fim absoluto da string

# Quantificadores
### * : Zero ou mais ocorrências.
### + : Uma ou mais ocorrências.
### ? : Zero ou uma ocorrência.
### {n} : Exatamente n ocorrências.
### {n,} : Pelo menos n ocorrências.
### {n,m} : Entre n e m ocorrências.

# Agrupamento e Alternância
### ( ) : Agrupamento de subexpressões.
### | : Alternância lógica (ou).
### Classes de Caracteres
### [abc] : Qualquer caractere a, b ou c.
### [^abc] : Qualquer caractere que não seja a, b ou c.
### [a-z] : Qualquer caractere entre a e z (inclusivo).
### [a-zA-Z0-9] : Combinação de intervalos.
### Classes predefinidas dentro de []:

### [\d] : Qualquer dígito (equivale a [0-9]).
### [\D] : Qualquer não-dígito.
### [\s] : Qualquer espaço em branco.
### [\S] : Qualquer não-espaço em branco.
### [\w] : Qualquer caractere de palavra.
### [\W] : Qualquer não-caractere de palavra.

# Metacaracteres de Escape

### \ : Escapa caracteres especiais (como \. para ponto literal).

# Atributos de Grupos
### (?:...) : Grupo de não captura.
### (?=...) : Lookahead positivo.
### (?!...) : Lookahead negativo.
### (?<=...): Lookbehind positivo.
### (?<!...): Lookbehind negativo.
### (?>...) : Grupo de exclusão.

# Flags Inline

### (?i) : Ignorar maiúsculas e minúsculas.
### (?m) : Modo multilinha (^ e $ correspondem ao início e fim de cada linha).
### (?s) : Permitir que . corresponda a quebras de linha.
### (?u) : Usa regras de Unicode para correspondência.
### (?x) : Modo de comentários (ignora espaços em branco na regex).

# Correspondências Avançadas

### \Q...\E : Escapa uma sequência literal de caracteres.
### Exemplo: \Q[abc]\E corresponde literalmente a [abc].