using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OO_csharp
{
    public class Produto : EntidadeBase
    {
        public required string Nome { get; set; }
        public double Preco { get; set; }
        public string? Descricao { get; set; }
        public List<string> ImagensUrl { get; set; } = [];

        //Relacionamento virtual é uma forma de dizer que pode ser sobrescrito
        //são utilizados rm mapeamentos de entidades  e são uma boa prática
        public virtual Categoria? Categoria { get; set; }
    }
}
